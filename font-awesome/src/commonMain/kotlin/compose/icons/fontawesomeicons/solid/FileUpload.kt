package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FileUpload: ImageVector
    get() {
        if (_fileUpload != null) {
            return _fileUpload!!
        }
        _fileUpload = Builder(name = "FileUpload", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 136.0f)
                lineTo(224.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                verticalLineToRelative(464.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(384.0f, 160.0f)
                lineTo(248.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                close()
                moveTo(289.18f, 352.01f)
                lineTo(224.0f, 352.01f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-80.0f)
                lineTo(94.82f, 352.01f)
                curveToRelative(-14.28f, 0.0f, -21.41f, -17.29f, -11.27f, -27.36f)
                lineToRelative(96.42f, -95.7f)
                curveToRelative(6.65f, -6.61f, 17.39f, -6.61f, 24.04f, 0.0f)
                lineToRelative(96.42f, 95.7f)
                curveToRelative(10.15f, 10.07f, 3.03f, 27.36f, -11.25f, 27.36f)
                close()
                moveTo(377.0f, 105.0f)
                lineTo(279.1f, 7.0f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7.0f, -17.0f, -7.0f)
                lineTo(256.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0.0f, -6.3f, -2.5f, -12.4f, -7.0f, -16.9f)
                close()
            }
        }
        .build()
        return _fileUpload!!
    }

private var _fileUpload: ImageVector? = null
