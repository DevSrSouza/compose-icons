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

public val SimpleIcons.Mlflow: ImageVector
    get() {
        if (_mlflow != null) {
            return _mlflow!!
        }
        _mlflow = Builder(name = "Mlflow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.883f, 0.002f)
                arcToRelative(12.044f, 12.044f, 0.0f, false, false, -9.326f, 19.463f)
                lineToRelative(3.668f, -2.694f)
                arcTo(7.573f, 7.573f, 0.0f, false, true, 12.043f, 4.45f)
                verticalLineToRelative(2.867f)
                lineToRelative(6.908f, -5.14f)
                arcTo(12.012f, 12.012f, 0.0f, false, false, 11.883f, 0.002f)
                close()
                moveTo(21.445f, 4.535f)
                lineTo(17.777f, 7.23f)
                arcToRelative(7.573f, 7.573f, 0.0f, false, true, -5.818f, 12.322f)
                verticalLineToRelative(-2.867f)
                lineToRelative(-6.908f, 5.14f)
                arcToRelative(12.046f, 12.046f, 0.0f, false, false, 16.394f, -17.29f)
                close()
            }
        }
        .build()
        return _mlflow!!
    }

private var _mlflow: ImageVector? = null
