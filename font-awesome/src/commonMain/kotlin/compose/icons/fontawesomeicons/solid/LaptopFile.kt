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
                moveTo(192.0f, 0.0f)
                lineTo(48.0f, 0.0f)
                curveTo(21.5f, 0.0f, 0.0f, 21.5f, 0.0f, 48.0f)
                lineTo(0.0f, 368.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineTo(162.7f, 416.0f)
                curveToRelative(6.6f, -18.6f, 24.4f, -32.0f, 45.3f, -32.0f)
                lineTo(208.0f, 272.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                horizontalLineToRelative(32.0f)
                lineTo(320.0f, 128.0f)
                lineTo(224.0f, 128.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(192.0f, 0.0f)
                close()
                moveTo(288.0f, 224.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineToRelative(16.0f)
                verticalLineToRelative(96.0f)
                verticalLineToRelative(32.0f)
                lineTo(208.0f, 416.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(576.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(640.0f, 432.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(592.0f, 416.0f)
                lineTo(592.0f, 288.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(320.0f, 224.0f)
                lineTo(304.0f, 224.0f)
                lineTo(288.0f, 224.0f)
                close()
                moveTo(320.0f, 288.0f)
                lineTo(528.0f, 288.0f)
                lineTo(528.0f, 416.0f)
                lineTo(304.0f, 416.0f)
                lineTo(304.0f, 288.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(224.0f, 0.0f)
                lineTo(224.0f, 96.0f)
                horizontalLineToRelative(96.0f)
                lineTo(224.0f, 0.0f)
                close()
            }
        }
        .build()
        return _laptopFile!!
    }

private var _laptopFile: ImageVector? = null
