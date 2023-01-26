package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.BuildCircle: ImageVector
    get() {
        if (_buildCircle != null) {
            return _buildCircle!!
        }
        _buildCircle = Builder(name = "BuildCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.9f, 15.49f)
                lineToRelative(-1.4f, 1.4f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f)
                lineToRelative(-3.41f, -3.41f)
                curveToRelative(-1.22f, 0.43f, -2.64f, 0.17f, -3.62f, -0.81f)
                curveToRelative(-1.11f, -1.11f, -1.3f, -2.79f, -0.59f, -4.1f)
                lineToRelative(2.35f, 2.35f)
                lineToRelative(1.41f, -1.41f)
                lineTo(8.58f, 7.17f)
                curveToRelative(1.32f, -0.71f, 2.99f, -0.52f, 4.1f, 0.59f)
                curveToRelative(0.98f, 0.98f, 1.24f, 2.4f, 0.81f, 3.62f)
                lineToRelative(3.41f, 3.41f)
                curveTo(17.09f, 14.98f, 17.09f, 15.3f, 16.9f, 15.49f)
                close()
            }
        }
        .build()
        return _buildCircle!!
    }

private var _buildCircle: ImageVector? = null
