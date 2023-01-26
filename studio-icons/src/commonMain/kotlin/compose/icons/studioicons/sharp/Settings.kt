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

public val SharpGroup.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.44f, 12.99f)
                lineToRelative(-0.01f, 0.02f)
                curveToRelative(0.04f, -0.33f, 0.08f, -0.67f, 0.08f, -1.01f)
                curveToRelative(0.0f, -0.34f, -0.03f, -0.66f, -0.07f, -0.99f)
                lineToRelative(0.01f, 0.02f)
                lineToRelative(2.44f, -1.92f)
                lineToRelative(-2.43f, -4.22f)
                lineToRelative(-2.87f, 1.16f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(-0.52f, -0.4f, -1.09f, -0.74f, -1.71f, -1.0f)
                horizontalLineToRelative(0.01f)
                lineTo(14.44f, 2.0f)
                horizontalLineTo(9.57f)
                lineToRelative(-0.44f, 3.07f)
                horizontalLineToRelative(0.01f)
                curveToRelative(-0.62f, 0.26f, -1.19f, 0.6f, -1.71f, 1.0f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(-2.88f, -1.17f)
                lineToRelative(-2.44f, 4.22f)
                lineToRelative(2.44f, 1.92f)
                lineToRelative(0.01f, -0.02f)
                curveToRelative(-0.04f, 0.33f, -0.07f, 0.65f, -0.07f, 0.99f)
                curveToRelative(0.0f, 0.34f, 0.03f, 0.68f, 0.08f, 1.01f)
                lineToRelative(-0.01f, -0.02f)
                lineToRelative(-2.1f, 1.65f)
                lineToRelative(-0.33f, 0.26f)
                lineToRelative(2.43f, 4.2f)
                lineToRelative(2.88f, -1.15f)
                lineToRelative(-0.02f, -0.04f)
                curveToRelative(0.53f, 0.41f, 1.1f, 0.75f, 1.73f, 1.01f)
                horizontalLineToRelative(-0.03f)
                lineTo(9.58f, 22.0f)
                horizontalLineToRelative(4.85f)
                reflectiveCurveToRelative(0.03f, -0.18f, 0.06f, -0.42f)
                lineToRelative(0.38f, -2.65f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(0.62f, -0.26f, 1.2f, -0.6f, 1.73f, -1.01f)
                lineToRelative(-0.02f, 0.04f)
                lineToRelative(2.88f, 1.15f)
                lineToRelative(2.43f, -4.2f)
                reflectiveCurveToRelative(-0.14f, -0.12f, -0.33f, -0.26f)
                lineToRelative(-2.11f, -1.66f)
                close()
                moveTo(12.0f, 15.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
