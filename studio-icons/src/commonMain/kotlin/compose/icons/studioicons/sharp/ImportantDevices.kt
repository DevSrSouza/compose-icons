package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ImportantDevices: ImageVector
    get() {
        if (_importantDevices != null) {
            return _importantDevices!!
        }
        _importantDevices = Builder(name = "ImportantDevices", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.01f)
                lineTo(17.0f, 11.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(11.01f)
                close()
                moveTo(23.0f, 20.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(22.0f, 2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(11.97f, 9.0f)
                lineTo(11.0f, 6.0f)
                lineToRelative(-0.97f, 3.0f)
                horizontalLineTo(7.0f)
                lineToRelative(2.47f, 1.76f)
                lineToRelative(-0.94f, 2.91f)
                lineToRelative(2.47f, -1.8f)
                lineToRelative(2.47f, 1.8f)
                lineToRelative(-0.94f, -2.91f)
                lineTo(15.0f, 9.0f)
                horizontalLineToRelative(-3.03f)
                close()
            }
        }
        .build()
        return _importantDevices!!
    }

private var _importantDevices: ImageVector? = null
