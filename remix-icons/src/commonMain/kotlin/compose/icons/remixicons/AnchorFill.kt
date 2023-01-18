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

public val RemixIcons.AnchorFill: ImageVector
    get() {
        if (_anchorFill != null) {
            return _anchorFill!!
        }
        _anchorFill = Builder(name = "AnchorFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.874f)
                verticalLineToRelative(10.054f)
                curveToRelative(3.619f, -0.453f, 6.487f, -3.336f, 6.938f, -6.972f)
                horizontalLineTo(17.0f)
                lineTo(20.704f, 7.0f)
                arcTo(10.041f, 10.041f, 0.0f, false, true, 22.0f, 11.95f)
                curveTo(22.0f, 17.5f, 17.523f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(2.0f, 17.5f, 2.0f, 11.95f)
                curveToRelative(0.0f, -1.8f, 0.471f, -3.489f, 1.296f, -4.95f)
                lineTo(7.0f, 12.956f)
                horizontalLineTo(4.062f)
                curveToRelative(0.451f, 3.636f, 3.32f, 6.519f, 6.938f, 6.972f)
                verticalLineTo(9.874f)
                arcTo(4.002f, 4.002f, 0.0f, false, true, 12.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.0f, 7.874f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _anchorFill!!
    }

private var _anchorFill: ImageVector? = null
