package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Qualtrics: ImageVector
    get() {
        if (_qualtrics != null) {
            return _qualtrics!!
        }
        _qualtrics = Builder(name = "Qualtrics", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.14f, 5.518f)
                lineToRelative(-2.695f, 9.538f)
                horizontalLineToRelative(-0.034f)
                lineToRelative(-2.89f, -9.538f)
                horizontalLineTo(8.125f)
                lineToRelative(-2.19f, 3.893f)
                lineToRelative(-2.318f, -3.893f)
                horizontalLineTo(0.368f)
                lineToRelative(3.78f, 6.116f)
                lineTo(0.0f, 18.486f)
                horizontalLineToRelative(2.993f)
                lineToRelative(2.66f, -4.534f)
                lineToRelative(2.755f, 4.534f)
                horizontalLineToRelative(4.906f)
                verticalLineToRelative(-8.99f)
                horizontalLineToRelative(0.034f)
                quadToRelative(0.102f, 0.564f, 0.195f, 0.966f)
                quadToRelative(0.093f, 0.402f, 0.175f, 0.744f)
                curveToRelative(0.057f, 0.228f, 0.118f, 0.445f, 0.184f, 0.65f)
                curveToRelative(0.065f, 0.206f, 0.132f, 0.43f, 0.2f, 0.677f)
                lineToRelative(1.926f, 5.949f)
                horizontalLineToRelative(2.523f)
                lineToRelative(1.942f, -5.95f)
                quadToRelative(0.213f, -0.718f, 0.398f, -1.385f)
                arcToRelative(14.544f, 14.544f, 0.0f, false, false, 0.32f, -1.506f)
                horizontalLineToRelative(0.035f)
                verticalLineToRelative(8.845f)
                horizontalLineTo(24.0f)
                verticalLineTo(5.514f)
                close()
                moveTo(7.373f, 11.651f)
                lineToRelative(3.383f, -5.616f)
                verticalLineToRelative(11.118f)
                close()
            }
        }
        .build()
        return _qualtrics!!
    }

private var _qualtrics: ImageVector? = null
