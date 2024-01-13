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

public val SimpleIcons.Bentoml: ImageVector
    get() {
        if (_bentoml != null) {
            return _bentoml!!
        }
        _bentoml = Builder(name = "Bentoml", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3f, 11.0f)
                arcToRelative(1.1f, 1.1f, 0.0f, true, false, 0.0f, -2.2f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.0f, 2.2f)
                close()
                moveTo(11.9f, 11.0f)
                arcToRelative(1.1f, 1.1f, 0.0f, true, false, 0.0f, -2.2f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.0f, 2.2f)
                close()
                moveTo(5.67f, 0.0f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.815f, 0.318f)
                lineTo(0.386f, 4.444f)
                arcTo(1.2f, 1.2f, 0.0f, false, false, 0.0f, 5.325f)
                lineTo(0.0f, 22.4f)
                arcTo(1.6f, 1.6f, 0.0f, false, false, 1.6f, 24.0f)
                horizontalLineToRelative(17.048f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.911f, -0.42f)
                lineToRelative(4.152f, -4.843f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.289f, -0.781f)
                lineTo(24.0f, 1.6f)
                arcTo(1.6f, 1.6f, 0.0f, false, false, 22.4f, 0.0f)
                close()
                moveTo(6.0f, 0.6f)
                horizontalLineToRelative(16.2f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.2f, 1.2f)
                verticalLineToRelative(15.8f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -1.6f, 1.6f)
                lineTo(6.0f, 19.2f)
                arcTo(1.2f, 1.2f, 0.0f, false, true, 4.8f, 18.0f)
                lineTo(4.8f, 1.8f)
                arcTo(1.2f, 1.2f, 0.0f, false, true, 6.0f, 0.6f)
                close()
            }
        }
        .build()
        return _bentoml!!
    }

private var _bentoml: ImageVector? = null
