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

public val SharpGroup.DataSaverOn: ImageVector
    get() {
        if (_dataSaverOn != null) {
            return _dataSaverOn!!
        }
        _dataSaverOn = Builder(name = "DataSaverOn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.0f, 2.05f)
                verticalLineToRelative(3.03f)
                curveToRelative(3.39f, 0.49f, 6.0f, 3.39f, 6.0f, 6.92f)
                curveToRelative(0.0f, 0.9f, -0.18f, 1.75f, -0.48f, 2.54f)
                lineToRelative(2.6f, 1.53f)
                curveTo(21.68f, 14.83f, 22.0f, 13.45f, 22.0f, 12.0f)
                curveTo(22.0f, 6.82f, 18.05f, 2.55f, 13.0f, 2.05f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f)
                curveToRelative(0.0f, -3.53f, 2.61f, -6.43f, 6.0f, -6.92f)
                verticalLineTo(2.05f)
                curveTo(5.94f, 2.55f, 2.0f, 6.81f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f)
                curveToRelative(3.31f, 0.0f, 6.24f, -1.61f, 8.06f, -4.09f)
                lineToRelative(-2.6f, -1.53f)
                curveTo(16.17f, 17.98f, 14.21f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _dataSaverOn!!
    }

private var _dataSaverOn: ImageVector? = null
