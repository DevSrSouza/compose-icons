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

public val SolidGroup.LaptopFile: ImageVector
    get() {
        if (_laptopFile != null) {
            return _laptopFile!!
        }
        _laptopFile = Builder(name = "LaptopFile", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 0.0f)
                curveTo(92.7f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineTo(64.0f, 288.0f)
                lineTo(19.2f, 288.0f)
                curveTo(8.6f, 288.0f, 0.0f, 296.6f, 0.0f, 307.2f)
                curveTo(0.0f, 349.6f, 34.4f, 384.0f, 76.8f, 384.0f)
                lineTo(320.0f, 384.0f)
                lineTo(320.0f, 288.0f)
                lineTo(128.0f, 288.0f)
                lineTo(128.0f, 64.0f)
                lineTo(448.0f, 64.0f)
                lineTo(448.0f, 96.0f)
                horizontalLineToRelative(64.0f)
                lineTo(512.0f, 64.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(128.0f, 0.0f)
                close()
                moveTo(512.0f, 128.0f)
                lineTo(400.0f, 128.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineTo(352.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineTo(592.0f, 512.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(640.0f, 256.0f)
                lineTo(544.0f, 256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(512.0f, 128.0f)
                close()
                moveTo(544.0f, 128.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(96.0f)
                lineToRelative(-96.0f, -96.0f)
                close()
            }
        }
        .build()
        return _laptopFile!!
    }

private var _laptopFile: ImageVector? = null
