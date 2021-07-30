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

public val SimpleIcons.Feedly: ImageVector
    get() {
        if (_feedly != null) {
            return _feedly!!
        }
        _feedly = Builder(name = "Feedly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.86f, 1.9885f)
                arcToRelative(2.6091f, 2.6091f, 0.0f, false, false, -3.7261f, 0.0f)
                lineTo(0.7677f, 11.5267f)
                arcToRelative(2.7291f, 2.7291f, 0.0f, false, false, 0.0f, 3.7951f)
                lineToRelative(6.6842f, 6.8082f)
                arcToRelative(2.6181f, 2.6181f, 0.0f, false, false, 1.74f, 0.664f)
                horizontalLineToRelative(5.6131f)
                arcToRelative(2.6161f, 2.6161f, 0.0f, false, false, 1.872f, -0.791f)
                lineToRelative(6.5542f, -6.6752f)
                arcToRelative(2.7261f, 2.7261f, 0.0f, false, false, 0.0f, -3.7951f)
                lineToRelative(-9.3702f, -9.5442f)
                close()
                moveTo(13.5999f, 19.4109f)
                lineToRelative(-0.935f, 0.95f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, -0.268f, 0.114f)
                horizontalLineToRelative(-0.8f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, true, -0.247f, -0.096f)
                lineToRelative(-0.954f, -0.97f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, true, 0.0f, -0.542f)
                lineToRelative(1.337f, -1.36f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.531f, 0.0f)
                lineToRelative(1.337f, 1.361f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, true, 0.0f, 0.543f)
                close()
                moveTo(13.5999f, 13.6998f)
                lineToRelative(-3.7371f, 3.8081f)
                arcToRelative(0.374f, 0.374f, 0.0f, false, true, -0.268f, 0.111f)
                horizontalLineToRelative(-0.799f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, true, -0.25f, -0.093f)
                lineToRelative(-0.951f, -0.97f)
                arcToRelative(0.391f, 0.391f, 0.0f, false, true, 0.0f, -0.544f)
                lineToRelative(4.1391f, -4.2141f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, 0.531f, 0.0f)
                lineToRelative(1.337f, 1.362f)
                arcToRelative(0.386f, 0.386f, 0.0f, false, true, 0.0f, 0.54f)
                close()
                moveTo(13.5999f, 7.9927f)
                lineTo(7.0598f, 14.6528f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, -0.268f, 0.113f)
                horizontalLineToRelative(-0.8f)
                arcToRelative(0.373f, 0.373f, 0.0f, false, true, -0.249f, -0.094f)
                lineToRelative(-0.953f, -0.972f)
                arcToRelative(0.388f, 0.388f, 0.0f, false, true, 0.0f, -0.54f)
                lineTo(11.7329f, 6.0896f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, 0.531f, 0.0f)
                lineToRelative(1.337f, 1.36f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, true, 0.0f, 0.543f)
                close()
            }
        }
        .build()
        return _feedly!!
    }

private var _feedly: ImageVector? = null
