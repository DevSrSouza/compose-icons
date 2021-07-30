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

public val SimpleIcons.Todoist: ImageVector
    get() {
        if (_todoist != null) {
            return _todoist!!
        }
        _todoist = Builder(name = "Todoist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                verticalLineToRelative(3.858f)
                reflectiveCurveToRelative(3.854f, 2.24f, 4.098f, 2.38f)
                curveToRelative(0.31f, 0.18f, 0.694f, 0.177f, 1.004f, 0.0f)
                curveToRelative(0.26f, -0.147f, 8.02f, -4.608f, 8.136f, -4.675f)
                curveToRelative(0.279f, -0.161f, 0.58f, -0.107f, 0.748f, -0.01f)
                curveToRelative(0.164f, 0.097f, 0.606f, 0.348f, 0.84f, 0.48f)
                curveToRelative(0.232f, 0.134f, 0.221f, 0.502f, 0.013f, 0.622f)
                lineToRelative(-9.712f, 5.59f)
                curveToRelative(-0.346f, 0.2f, -0.69f, 0.204f, -1.048f, 0.002f)
                curveTo(3.478f, 10.907f, 0.998f, 9.463f, 0.0f, 8.882f)
                verticalLineToRelative(2.02f)
                lineToRelative(4.098f, 2.38f)
                curveToRelative(0.31f, 0.18f, 0.694f, 0.177f, 1.004f, 0.0f)
                curveToRelative(0.26f, -0.147f, 8.02f, -4.609f, 8.136f, -4.676f)
                curveToRelative(0.279f, -0.16f, 0.58f, -0.106f, 0.748f, -0.008f)
                curveToRelative(0.164f, 0.096f, 0.606f, 0.347f, 0.84f, 0.48f)
                curveToRelative(0.232f, 0.133f, 0.221f, 0.5f, 0.013f, 0.62f)
                curveToRelative(-0.208f, 0.121f, -9.288f, 5.346f, -9.712f, 5.59f)
                curveToRelative(-0.346f, 0.2f, -0.69f, 0.205f, -1.048f, 0.002f)
                curveTo(3.478f, 14.951f, 0.998f, 13.506f, 0.0f, 12.926f)
                verticalLineToRelative(2.02f)
                lineToRelative(4.098f, 2.38f)
                curveToRelative(0.31f, 0.18f, 0.694f, 0.177f, 1.004f, 0.0f)
                curveToRelative(0.26f, -0.147f, 8.02f, -4.609f, 8.136f, -4.676f)
                curveToRelative(0.279f, -0.16f, 0.58f, -0.106f, 0.748f, -0.009f)
                curveToRelative(0.164f, 0.097f, 0.606f, 0.348f, 0.84f, 0.48f)
                curveToRelative(0.232f, 0.133f, 0.221f, 0.502f, 0.013f, 0.622f)
                lineToRelative(-9.712f, 5.59f)
                curveToRelative(-0.346f, 0.199f, -0.69f, 0.204f, -1.048f, 0.001f)
                curveTo(3.478f, 18.994f, 0.998f, 17.55f, 0.0f, 16.97f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _todoist!!
    }

private var _todoist: ImageVector? = null
