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

public val SolidGroup.LaptopCode: ImageVector
    get() {
        if (_laptopCode != null) {
            return _laptopCode!!
        }
        _laptopCode = Builder(name = "LaptopCode", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                horizontalLineTo(512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(512.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(0.0f, 403.2f)
                curveTo(0.0f, 392.6f, 8.6f, 384.0f, 19.2f, 384.0f)
                horizontalLineTo(620.8f)
                curveToRelative(10.6f, 0.0f, 19.2f, 8.6f, 19.2f, 19.2f)
                curveToRelative(0.0f, 42.4f, -34.4f, 76.8f, -76.8f, 76.8f)
                horizontalLineTo(76.8f)
                curveTo(34.4f, 480.0f, 0.0f, 445.6f, 0.0f, 403.2f)
                close()
                moveTo(281.0f, 209.0f)
                lineToRelative(-31.0f, 31.0f)
                lineToRelative(31.0f, 31.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(48.0f, -48.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                close()
                moveTo(393.0f, 175.0f)
                lineToRelative(48.0f, 48.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-48.0f, 48.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(31.0f, -31.0f)
                lineToRelative(-31.0f, -31.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                close()
            }
        }
        .build()
        return _laptopCode!!
    }

private var _laptopCode: ImageVector? = null
