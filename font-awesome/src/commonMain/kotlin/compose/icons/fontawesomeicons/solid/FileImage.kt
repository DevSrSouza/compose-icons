package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FileImage: ImageVector
    get() {
        if (_fileImage != null) {
            return _fileImage!!
        }
        _fileImage = Builder(name = "FileImage", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 121.94f)
                lineTo(384.0f, 128.0f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                horizontalLineToRelative(6.06f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 16.97f, 7.03f)
                lineToRelative(97.94f, 97.94f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 7.03f, 16.97f)
                close()
                moveTo(248.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                lineTo(224.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.74f, 0.0f, 0.0f, 10.74f, 0.0f, 24.0f)
                verticalLineToRelative(464.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                lineTo(384.0f, 160.0f)
                lineTo(248.0f, 160.0f)
                close()
                moveTo(112.54f, 176.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.49f, 48.0f, -48.0f, 48.0f)
                reflectiveCurveToRelative(-48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                close()
                moveTo(320.54f, 416.0f)
                horizontalLineToRelative(-256.0f)
                lineToRelative(0.49f, -48.49f)
                lineTo(104.54f, 328.0f)
                curveToRelative(4.69f, -4.69f, 11.8f, -4.2f, 16.49f, 0.49f)
                lineTo(160.54f, 368.0f)
                lineTo(264.06f, 264.48f)
                curveToRelative(4.69f, -4.69f, 12.28f, -4.69f, 16.97f, 0.0f)
                lineTo(320.55f, 304.0f)
                verticalLineToRelative(112.0f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
