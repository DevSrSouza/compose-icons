package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ManageAccounts: ImageVector
    get() {
        if (_manageAccounts != null) {
            return _manageAccounts!!
        }
        _manageAccounts = Builder(name = "ManageAccounts", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.67f, 13.02f)
                curveTo(10.45f, 13.01f, 10.23f, 13.0f, 10.0f, 13.0f)
                curveToRelative(-2.42f, 0.0f, -4.68f, 0.67f, -6.61f, 1.82f)
                curveTo(2.51f, 15.34f, 2.0f, 16.32f, 2.0f, 17.35f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(9.26f)
                curveTo(10.47f, 18.87f, 10.0f, 17.49f, 10.0f, 16.0f)
                curveTo(10.0f, 14.93f, 10.25f, 13.93f, 10.67f, 13.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.75f, 16.0f)
                curveToRelative(0.0f, -0.22f, -0.03f, -0.42f, -0.06f, -0.63f)
                lineToRelative(1.14f, -1.01f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(-1.45f, 0.49f)
                curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f)
                lineTo(18.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.3f, 1.49f)
                curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f)
                lineToRelative(-1.45f, -0.49f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(1.14f, 1.01f)
                curveToRelative(-0.03f, 0.21f, -0.06f, 0.41f, -0.06f, 0.63f)
                reflectiveCurveToRelative(0.03f, 0.42f, 0.06f, 0.63f)
                lineToRelative(-1.14f, 1.01f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(1.45f, -0.49f)
                curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f)
                lineTo(16.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.3f, -1.49f)
                curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f)
                lineToRelative(1.45f, 0.49f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(-1.14f, -1.01f)
                curveTo(20.72f, 16.42f, 20.75f, 16.22f, 20.75f, 16.0f)
                close()
                moveTo(17.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveTo(18.1f, 18.0f, 17.0f, 18.0f)
                close()
            }
        }
        .build()
        return _manageAccounts!!
    }

private var _manageAccounts: ImageVector? = null
