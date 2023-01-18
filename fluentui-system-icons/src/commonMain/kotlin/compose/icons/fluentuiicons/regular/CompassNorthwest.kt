package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.CompassNorthwest: ImageVector
    get() {
        if (_compassNorthwest != null) {
            return _compassNorthwest!!
        }
        _compassNorthwest = Builder(name = "CompassNorthwest", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.7074f, 7.0837f)
                curveTo(7.6879f, 6.6774f, 6.6772f, 7.6881f, 7.0835f, 8.7076f)
                lineTo(8.6887f, 12.7357f)
                curveTo(9.1559f, 13.908f, 10.0703f, 14.8461f, 11.2301f, 15.3432f)
                lineTo(15.5555f, 17.197f)
                curveTo(16.5927f, 17.6415f, 17.6414f, 16.5928f, 17.1969f, 15.5556f)
                lineTo(15.3431f, 11.2303f)
                curveTo(14.8461f, 10.0704f, 13.9078f, 9.156f, 12.7356f, 8.6888f)
                lineTo(8.7074f, 7.0837f)
                close()
                moveTo(10.0822f, 12.1804f)
                lineTo(8.6921f, 8.6923f)
                lineTo(12.1803f, 10.0823f)
                curveTo(12.9824f, 10.4019f, 13.6243f, 11.0275f, 13.9644f, 11.8211f)
                lineTo(15.572f, 15.572f)
                lineTo(11.821f, 13.9645f)
                curveTo(11.0274f, 13.6244f, 10.4018f, 12.9825f, 10.0822f, 12.1804f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.2499f, 11.0f)
                horizontalLineTo(3.5582f)
                curveTo(4.0147f, 7.1048f, 7.1048f, 4.0147f, 11.0f, 3.5582f)
                verticalLineTo(4.25f)
                curveTo(11.0f, 4.6642f, 11.3358f, 5.0f, 11.75f, 5.0f)
                curveTo(12.1642f, 5.0f, 12.5f, 4.6642f, 12.5f, 4.25f)
                verticalLineTo(3.5145f)
                curveTo(16.6282f, 3.7539f, 19.9659f, 6.9395f, 20.4418f, 11.0f)
                horizontalLineTo(19.75f)
                curveTo(19.3358f, 11.0f, 19.0f, 11.3358f, 19.0f, 11.75f)
                curveTo(19.0f, 12.1642f, 19.3358f, 12.5f, 19.75f, 12.5f)
                horizontalLineTo(20.4855f)
                curveTo(20.2363f, 16.7962f, 16.7962f, 20.2363f, 12.5f, 20.4855f)
                verticalLineTo(19.75f)
                curveTo(12.5f, 19.3358f, 12.1642f, 19.0f, 11.75f, 19.0f)
                curveTo(11.3358f, 19.0f, 11.0f, 19.3358f, 11.0f, 19.75f)
                verticalLineTo(20.4418f)
                curveTo(6.9395f, 19.9659f, 3.7539f, 16.6282f, 3.5145f, 12.5f)
                horizontalLineTo(4.2499f)
                curveTo(4.6641f, 12.5f, 4.9999f, 12.1642f, 4.9999f, 11.75f)
                curveTo(4.9999f, 11.3358f, 4.6641f, 11.0f, 4.2499f, 11.0f)
                close()
            }
        }
        .build()
        return _compassNorthwest!!
    }

private var _compassNorthwest: ImageVector? = null
