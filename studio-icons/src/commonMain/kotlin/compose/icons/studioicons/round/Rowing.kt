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

public val RoundGroup.Rowing: ImageVector
    get() {
        if (_rowing != null) {
            return _rowing!!
        }
        _rowing = Builder(name = "Rowing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 18.25f)
                curveToRelative(-0.41f, 0.41f, -0.41f, 1.09f, 0.0f, 1.5f)
                curveToRelative(0.41f, 0.41f, 1.09f, 0.41f, 1.5f, 0.0f)
                lineTo(9.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-3.75f, 3.75f)
                close()
                moveTo(15.0f, 5.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(20.29f, 20.3f)
                lineToRelative(-2.0f, -2.01f)
                curveToRelative(-0.18f, -0.18f, -0.44f, -0.29f, -0.71f, -0.29f)
                lineTo(16.5f, 18.0f)
                lineToRelative(-6.29f, -6.29f)
                curveToRelative(0.79f, -0.33f, 1.66f, -0.87f, 2.29f, -1.39f)
                verticalLineToRelative(2.27f)
                lineToRelative(3.58f, 3.58f)
                curveToRelative(0.57f, -0.55f, 0.92f, -1.32f, 0.92f, -2.16f)
                lineTo(17.0f, 8.26f)
                curveTo(17.0f, 7.02f, 15.98f, 6.0f, 14.74f, 6.0f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.34f, 0.0f, -0.67f, 0.09f, -0.96f, 0.23f)
                curveToRelative(-0.26f, 0.12f, -0.5f, 0.29f, -0.69f, 0.5f)
                lineToRelative(-1.4f, 1.55f)
                curveTo(10.61f, 9.45f, 8.66f, 10.35f, 7.0f, 10.32f)
                curveToRelative(-0.6f, 0.0f, -1.08f, 0.48f, -1.08f, 1.08f)
                curveToRelative(0.0f, 0.6f, 0.48f, 1.08f, 1.08f, 1.08f)
                curveToRelative(0.31f, 0.0f, 0.61f, -0.03f, 0.9f, -0.07f)
                lineToRelative(7.11f, 7.09f)
                verticalLineToRelative(1.08f)
                curveToRelative(0.0f, 0.26f, 0.1f, 0.52f, 0.29f, 0.7f)
                lineToRelative(1.99f, 2.01f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f)
                lineToRelative(1.58f, -1.58f)
                curveToRelative(0.39f, -0.38f, 0.39f, -1.02f, 0.0f, -1.41f)
                close()
            }
        }
        .build()
        return _rowing!!
    }

private var _rowing: ImageVector? = null
