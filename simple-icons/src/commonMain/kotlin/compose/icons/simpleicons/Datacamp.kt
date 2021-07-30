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

public val SimpleIcons.Datacamp: ImageVector
    get() {
        if (_datacamp != null) {
            return _datacamp!!
        }
        _datacamp = Builder(name = "Datacamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.946f, 18.151f)
                verticalLineToRelative(-5.239f)
                lineTo(21.209f, 8.2f)
                lineTo(19.2f, 7.048f)
                lineToRelative(-6.254f, 3.567f)
                verticalLineTo(5.36f)
                curveToRelative(0.0f, -0.356f, -0.192f, -0.689f, -0.5f, -0.866f)
                lineTo(4.922f, 0.177f)
                arcToRelative(1.434f, 1.434f, 0.0f, false, false, -1.455f, 0.044f)
                arcToRelative(1.438f, 1.438f, 0.0f, false, false, -0.676f, 1.224f)
                verticalLineToRelative(14.777f)
                arcTo(1.44f, 1.44f, 0.0f, false, false, 4.92f, 17.49f)
                lineToRelative(6.032f, -3.44f)
                verticalLineToRelative(4.683f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.504f, 0.867f)
                lineToRelative(7.73f, 4.4f)
                lineToRelative(2.01f, -1.152f)
                lineToRelative(-8.25f, -4.697f)
                close()
                moveTo(10.953f, 5.938f)
                verticalLineToRelative(5.814f)
                lineTo(4.785f, 15.27f)
                verticalLineTo(2.4f)
                lineToRelative(6.168f, 3.539f)
                verticalLineToRelative(-0.001f)
                close()
            }
        }
        .build()
        return _datacamp!!
    }

private var _datacamp: ImageVector? = null
