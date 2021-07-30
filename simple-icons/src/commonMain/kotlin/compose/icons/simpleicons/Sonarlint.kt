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

public val SimpleIcons.Sonarlint: ImageVector
    get() {
        if (_sonarlint != null) {
            return _sonarlint!!
        }
        _sonarlint = Builder(name = "Sonarlint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.412f, 0.0f, 0.0f, 5.342f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.66f, 5.411f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.59f, 0.0f, 12.0f, -5.41f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.658f, -5.41f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 2.22f)
                arcTo(9.77f, 9.77f, 0.0f, false, true, 21.78f, 12.0f)
                arcTo(9.768f, 9.768f, 0.0f, false, true, 12.0f, 21.78f)
                arcTo(9.77f, 9.77f, 0.0f, false, true, 2.22f, 12.0f)
                arcTo(9.771f, 9.771f, 0.0f, false, true, 12.0f, 2.22f)
                close()
                moveTo(5.203f, 9.988f)
                curveToRelative(-0.763f, 0.0f, -1.179f, 0.763f, -1.456f, 1.387f)
                curveToRelative(0.0f, 0.0f, -0.208f, 0.555f, -0.347f, 0.763f)
                curveToRelative(-0.07f, 0.277f, -0.486f, 1.18f, -0.14f, 1.665f)
                curveToRelative(0.209f, 0.277f, 0.486f, -0.139f, 0.694f, -0.347f)
                curveToRelative(0.139f, -0.208f, 0.418f, -0.833f, 0.418f, -0.833f)
                curveToRelative(0.346f, -0.555f, 0.485f, -0.832f, 0.831f, -0.832f)
                curveToRelative(0.347f, 0.0f, 0.555f, 0.278f, 0.832f, 0.902f)
                curveToRelative(0.347f, 0.625f, 0.695f, 1.388f, 1.458f, 1.388f)
                reflectiveCurveToRelative(1.179f, -0.763f, 1.456f, -1.388f)
                curveToRelative(0.278f, -0.555f, 0.485f, -0.902f, 0.832f, -0.902f)
                reflectiveCurveToRelative(0.556f, 0.278f, 0.833f, 0.902f)
                curveToRelative(0.347f, 0.625f, 0.694f, 1.388f, 1.457f, 1.388f)
                curveToRelative(0.763f, 0.0f, 1.179f, -0.763f, 1.456f, -1.388f)
                curveToRelative(0.278f, -0.555f, 0.485f, -0.902f, 0.832f, -0.902f)
                reflectiveCurveToRelative(0.556f, 0.278f, 0.833f, 0.902f)
                curveToRelative(0.347f, 0.625f, 0.694f, 1.388f, 1.457f, 1.388f)
                curveToRelative(0.763f, 0.0f, 1.179f, -0.763f, 1.456f, -1.388f)
                curveToRelative(0.277f, -0.555f, 0.486f, -0.902f, 0.833f, -0.902f)
                reflectiveCurveToRelative(0.555f, 0.278f, 0.832f, 0.902f)
                curveToRelative(0.0f, 0.0f, 0.139f, 0.277f, 0.347f, 0.624f)
                curveToRelative(0.07f, 0.138f, 0.416f, 0.693f, 0.693f, 0.693f)
                curveToRelative(0.278f, 0.0f, 0.347f, -0.832f, 0.07f, -1.525f)
                curveToRelative(-0.278f, -0.625f, -0.485f, -1.11f, -0.485f, -1.11f)
                curveToRelative(-0.347f, -0.624f, -0.694f, -1.387f, -1.457f, -1.387f)
                curveToRelative(-0.763f, 0.0f, -1.18f, 0.763f, -1.458f, 1.387f)
                curveToRelative(-0.277f, 0.555f, -0.485f, 0.901f, -0.831f, 0.901f)
                curveToRelative(-0.347f, 0.0f, -0.555f, -0.277f, -0.832f, -0.9f)
                curveToRelative(-0.347f, -0.625f, -0.695f, -1.388f, -1.458f, -1.388f)
                reflectiveCurveToRelative(-1.179f, 0.763f, -1.456f, 1.387f)
                curveToRelative(-0.278f, 0.555f, -0.485f, 0.901f, -0.832f, 0.901f)
                reflectiveCurveToRelative(-0.556f, -0.277f, -0.833f, -0.9f)
                curveToRelative(-0.347f, -0.625f, -0.694f, -1.388f, -1.457f, -1.388f)
                curveToRelative(-0.763f, 0.0f, -1.179f, 0.763f, -1.456f, 1.387f)
                curveToRelative(-0.278f, 0.555f, -0.485f, 0.901f, -0.832f, 0.901f)
                reflectiveCurveToRelative(-0.556f, -0.277f, -0.833f, -0.9f)
                curveToRelative(-0.347f, -0.625f, -0.694f, -1.388f, -1.457f, -1.388f)
                close()
            }
        }
        .build()
        return _sonarlint!!
    }

private var _sonarlint: ImageVector? = null
