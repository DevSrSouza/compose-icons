package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.RemixiconFill: ImageVector
    get() {
        if (_remixiconFill != null) {
            return _remixiconFill!!
        }
        _remixiconFill = Builder(name = "RemixiconFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.53f, 17.53f)
                lineTo(20.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(10.667f)
                verticalLineToRelative(0.008f)
                arcTo(7.118f, 7.118f, 0.0f, false, true, 14.136f, 4.0f)
                curveToRelative(-0.089f, 0.37f, -0.136f, 0.76f, -0.136f, 1.166f)
                curveTo(14.0f, 7.485f, 16.015f, 9.5f, 18.667f, 9.5f)
                curveToRelative(0.724f, 0.0f, 1.419f, -0.197f, 2.032f, -0.538f)
                arcToRelative(7.003f, 7.003f, 0.0f, false, true, -4.17f, 8.567f)
                close()
                moveTo(18.5f, 7.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                close()
            }
        }
        .build()
        return _remixiconFill!!
    }

private var _remixiconFill: ImageVector? = null
