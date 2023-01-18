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

public val RemixIcons.ShareCircleFill: ImageVector
    get() {
        if (_shareCircleFill != null) {
            return _shareCircleFill!!
        }
        _shareCircleFill = Builder(name = "ShareCircleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.05f)
                verticalLineToRelative(2.012f)
                arcTo(8.001f, 8.001f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, false, 7.938f, -7.0f)
                horizontalLineToRelative(2.013f)
                curveToRelative(-0.502f, 5.053f, -4.766f, 9.0f, -9.951f, 9.0f)
                curveToRelative(-5.523f, 0.0f, -10.0f, -4.477f, -10.0f, -10.0f)
                curveToRelative(0.0f, -5.185f, 3.947f, -9.449f, 9.0f, -9.95f)
                close()
                moveTo(18.707f, 6.707f)
                lineTo(12.0f, 13.414f)
                lineTo(10.586f, 12.0f)
                lineToRelative(6.707f, -6.707f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(-3.293f, -3.293f)
                close()
            }
        }
        .build()
        return _shareCircleFill!!
    }

private var _shareCircleFill: ImageVector? = null
