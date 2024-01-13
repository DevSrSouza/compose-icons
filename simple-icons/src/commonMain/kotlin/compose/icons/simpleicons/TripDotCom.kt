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

public val SimpleIcons.Tripdotcom: ImageVector
    get() {
        if (_tripdotcom != null) {
            return _tripdotcom!!
        }
        _tripdotcom = Builder(name = "Tripdotcom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.834f, 9.002f)
                curveToRelative(-0.68f, 0.0f, -1.29f, 0.31f, -1.707f, 0.799f)
                verticalLineToRelative(-0.514f)
                horizontalLineToRelative(-1.708f)
                verticalLineToRelative(8.348f)
                horizontalLineToRelative(1.897f)
                verticalLineToRelative(-2.923f)
                curveToRelative(0.416f, 0.344f, 0.943f, 0.551f, 1.518f, 0.551f)
                curveToRelative(1.677f, 0.0f, 3.036f, -1.401f, 3.036f, -3.13f)
                reflectiveCurveToRelative(-1.36f, -3.13f, -3.036f, -3.13f)
                close()
                moveTo(17.644f, 13.518f)
                curveToRelative(-0.733f, 0.0f, -1.328f, -0.62f, -1.328f, -1.385f)
                reflectiveCurveToRelative(0.595f, -1.385f, 1.328f, -1.385f)
                curveToRelative(0.734f, 0.0f, 1.328f, 0.62f, 1.328f, 1.385f)
                reflectiveCurveToRelative(-0.594f, 1.385f, -1.328f, 1.385f)
                close()
                moveTo(24.0f, 14.125f)
                arcToRelative(1.138f, 1.138f, 0.0f, true, true, -2.277f, 0.0f)
                arcToRelative(1.138f, 1.138f, 0.0f, false, true, 2.277f, 0.0f)
                close()
                moveTo(13.205f, 7.428f)
                arcToRelative(1.062f, 1.062f, 0.0f, true, true, -2.125f, 0.0f)
                arcToRelative(1.062f, 1.062f, 0.0f, false, true, 2.125f, 0.0f)
                close()
                moveTo(11.194f, 9.287f)
                horizontalLineToRelative(1.897f)
                verticalLineToRelative(5.692f)
                horizontalLineToRelative(-1.897f)
                lineTo(11.194f, 9.287f)
                close()
                moveTo(6.83f, 8.225f)
                lineTo(4.364f, 8.225f)
                verticalLineToRelative(6.754f)
                lineTo(2.466f, 14.979f)
                lineTo(2.466f, 8.225f)
                lineTo(0.0f, 8.225f)
                lineTo(0.0f, 6.63f)
                horizontalLineToRelative(6.83f)
                verticalLineToRelative(1.594f)
                close()
                moveTo(9.865f, 9.258f)
                curveToRelative(0.13f, 0.0f, 0.255f, 0.012f, 0.38f, 0.03f)
                verticalLineToRelative(1.74f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, false, -0.297f, -0.031f)
                curveToRelative(-0.88f, 0.0f, -1.594f, 0.612f, -1.594f, 1.593f)
                verticalLineToRelative(2.389f)
                lineTo(6.451f, 14.979f)
                lineTo(6.451f, 9.287f)
                horizontalLineToRelative(1.707f)
                verticalLineToRelative(0.9f)
                curveToRelative(0.363f, -0.558f, 0.991f, -0.93f, 1.707f, -0.93f)
                close()
            }
        }
        .build()
        return _tripdotcom!!
    }

private var _tripdotcom: ImageVector? = null
