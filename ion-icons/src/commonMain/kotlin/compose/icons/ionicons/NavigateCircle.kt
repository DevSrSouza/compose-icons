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

public val IonIcons.NavigateCircle: ImageVector
    get() {
        if (_navigateCircle != null) {
            return _navigateCircle!!
        }
        _navigateCircle = Builder(name = "NavigateCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(258.9f, 48.0f)
                curveTo(141.92f, 46.42f, 46.42f, 141.92f, 48.0f, 258.9f)
                curveTo(49.56f, 371.09f, 140.91f, 462.44f, 253.1f, 464.0f)
                curveToRelative(117.0f, 1.6f, 212.48f, -93.9f, 210.88f, -210.88f)
                curveTo(462.44f, 140.91f, 371.09f, 49.56f, 258.9f, 48.0f)
                close()
                moveTo(351.0f, 175.24f)
                lineTo(268.76f, 361.76f)
                curveToRelative(-4.79f, 10.47f, -20.78f, 7.0f, -20.78f, -4.56f)
                verticalLineTo(268.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(154.8f)
                curveToRelative(-11.52f, 0.0f, -15.0f, -15.87f, -4.57f, -20.67f)
                lineTo(336.76f, 161.0f)
                arcTo(10.73f, 10.73f, 0.0f, false, true, 351.0f, 175.24f)
                close()
            }
        }
        .build()
        return _navigateCircle!!
    }

private var _navigateCircle: ImageVector? = null
