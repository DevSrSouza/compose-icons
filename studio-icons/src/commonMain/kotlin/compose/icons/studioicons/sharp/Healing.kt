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

public val SharpGroup.Healing: ImageVector
    get() {
        if (_healing != null) {
            return _healing!!
        }
        _healing = Builder(name = "Healing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.74f, 12.01f)
                lineToRelative(4.68f, -4.68f)
                lineToRelative(-5.75f, -5.75f)
                lineToRelative(-4.68f, 4.68f)
                lineTo(7.3f, 1.58f)
                lineTo(1.55f, 7.34f)
                lineToRelative(4.68f, 4.69f)
                lineToRelative(-4.68f, 4.68f)
                lineToRelative(5.75f, 5.75f)
                lineToRelative(4.68f, -4.68f)
                lineToRelative(4.69f, 4.69f)
                lineToRelative(5.76f, -5.76f)
                lineToRelative(-4.69f, -4.7f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(7.29f, 10.96f)
                lineTo(3.66f, 7.34f)
                lineToRelative(3.63f, -3.63f)
                lineToRelative(3.62f, 3.62f)
                lineToRelative(-3.62f, 3.63f)
                close()
                moveTo(10.0f, 13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(14.0f, 11.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(16.66f, 20.34f)
                lineToRelative(-3.63f, -3.62f)
                lineToRelative(3.63f, -3.63f)
                lineToRelative(3.62f, 3.62f)
                lineToRelative(-3.62f, 3.63f)
                close()
            }
        }
        .build()
        return _healing!!
    }

private var _healing: ImageVector? = null
