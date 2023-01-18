package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = Builder(name = "Warning", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(449.07f, 399.08f)
                lineTo(278.64f, 82.58f)
                curveToRelative(-12.08f, -22.44f, -44.26f, -22.44f, -56.35f, 0.0f)
                lineTo(51.87f, 399.08f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 80.0f, 446.25f)
                lineTo(420.89f, 446.25f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 449.07f, 399.08f)
                close()
                moveTo(250.47f, 397.25f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 250.47f, 397.25f)
                close()
                moveTo(272.19f, 196.1f)
                lineToRelative(-5.74f, 122.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineToRelative(-5.74f, -121.95f)
                verticalLineToRelative(0.0f)
                arcToRelative(21.73f, 21.73f, 0.0f, false, true, 21.5f, -22.69f)
                horizontalLineToRelative(0.21f)
                arcToRelative(21.74f, 21.74f, 0.0f, false, true, 21.73f, 22.7f)
                close()
            }
        }
        .build()
        return _warning!!
    }

private var _warning: ImageVector? = null
