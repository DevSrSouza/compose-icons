package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.AccessAlarm: ImageVector
    get() {
        if (_accessAlarm != null) {
            return _accessAlarm!!
        }
        _accessAlarm = Builder(name = "AccessAlarm", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.87f, 15.25f)
                lineToRelative(-3.37f, -2.0f)
                lineTo(12.5f, 8.72f)
                curveToRelative(0.0f, -0.4f, -0.32f, -0.72f, -0.72f, -0.72f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(-0.4f, 0.0f, -0.72f, 0.32f, -0.72f, 0.72f)
                verticalLineToRelative(4.72f)
                curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f)
                lineToRelative(3.65f, 2.19f)
                curveToRelative(0.34f, 0.2f, 0.78f, 0.1f, 0.98f, -0.24f)
                curveToRelative(0.21f, -0.35f, 0.1f, -0.8f, -0.25f, -1.0f)
                close()
                moveTo(21.18f, 5.01f)
                lineTo(18.1f, 2.45f)
                curveToRelative(-0.42f, -0.35f, -1.05f, -0.3f, -1.41f, 0.13f)
                curveToRelative(-0.35f, 0.42f, -0.29f, 1.05f, 0.13f, 1.41f)
                lineToRelative(3.07f, 2.56f)
                curveToRelative(0.42f, 0.35f, 1.05f, 0.3f, 1.41f, -0.13f)
                curveToRelative(0.36f, -0.42f, 0.3f, -1.05f, -0.12f, -1.41f)
                close()
                moveTo(4.1f, 6.55f)
                lineToRelative(3.07f, -2.56f)
                curveToRelative(0.43f, -0.36f, 0.49f, -0.99f, 0.13f, -1.41f)
                curveToRelative(-0.35f, -0.43f, -0.98f, -0.48f, -1.4f, -0.13f)
                lineTo(2.82f, 5.01f)
                curveToRelative(-0.42f, 0.36f, -0.48f, 0.99f, -0.12f, 1.41f)
                curveToRelative(0.35f, 0.43f, 0.98f, 0.48f, 1.4f, 0.13f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _accessAlarm!!
    }

private var _accessAlarm: ImageVector? = null
