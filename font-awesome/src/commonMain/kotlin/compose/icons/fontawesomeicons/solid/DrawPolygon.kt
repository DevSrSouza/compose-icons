package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.DrawPolygon: ImageVector
    get() {
        if (_drawPolygon != null) {
            return _drawPolygon!!
        }
        _drawPolygon = Builder(name = "DrawPolygon", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 352.0f)
                curveToRelative(-0.35f, 0.0f, -0.67f, 0.1f, -1.02f, 0.1f)
                lineToRelative(-39.2f, -65.32f)
                curveToRelative(5.07f, -9.17f, 8.22f, -19.56f, 8.22f, -30.78f)
                reflectiveCurveToRelative(-3.14f, -21.61f, -8.22f, -30.78f)
                lineToRelative(39.2f, -65.32f)
                curveToRelative(0.35f, 0.01f, 0.67f, 0.1f, 1.02f, 0.1f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.65f, -64.0f, -64.0f, -64.0f)
                curveToRelative(-23.63f, 0.0f, -44.04f, 12.95f, -55.12f, 32.0f)
                lineTo(119.12f, 64.0f)
                curveTo(108.04f, 44.95f, 87.63f, 32.0f, 64.0f, 32.0f)
                curveTo(28.65f, 32.0f, 0.0f, 60.65f, 0.0f, 96.0f)
                curveToRelative(0.0f, 23.63f, 12.95f, 44.04f, 32.0f, 55.12f)
                verticalLineToRelative(209.75f)
                curveTo(12.95f, 371.96f, 0.0f, 392.37f, 0.0f, 416.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                curveToRelative(23.63f, 0.0f, 44.04f, -12.95f, 55.12f, -32.0f)
                horizontalLineToRelative(209.75f)
                curveToRelative(11.09f, 19.05f, 31.49f, 32.0f, 55.12f, 32.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                curveToRelative(0.01f, -35.35f, -28.64f, -64.0f, -63.99f, -64.0f)
                close()
                moveTo(96.0f, 360.88f)
                lineTo(96.0f, 151.12f)
                arcTo(63.83f, 63.83f, 0.0f, false, false, 119.12f, 128.0f)
                horizontalLineToRelative(208.36f)
                lineToRelative(-38.46f, 64.1f)
                curveToRelative(-0.35f, -0.01f, -0.67f, -0.1f, -1.02f, -0.1f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.65f, 64.0f, 64.0f, 64.0f)
                curveToRelative(0.35f, 0.0f, 0.67f, -0.1f, 1.02f, -0.1f)
                lineToRelative(38.46f, 64.1f)
                lineTo(119.12f, 384.0f)
                arcTo(63.75f, 63.75f, 0.0f, false, false, 96.0f, 360.88f)
                close()
                moveTo(272.0f, 256.0f)
                curveToRelative(0.0f, -8.82f, 7.18f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.18f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.18f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.18f, -16.0f, -16.0f)
                close()
                moveTo(400.0f, 96.0f)
                curveToRelative(0.0f, 8.82f, -7.18f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.18f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.18f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.18f, 16.0f, 16.0f)
                close()
                moveTo(64.0f, 80.0f)
                curveToRelative(8.82f, 0.0f, 16.0f, 7.18f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.18f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.18f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.18f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(48.0f, 416.0f)
                curveToRelative(0.0f, -8.82f, 7.18f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.18f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.18f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.18f, -16.0f, -16.0f)
                close()
                moveTo(384.0f, 432.0f)
                curveToRelative(-8.82f, 0.0f, -16.0f, -7.18f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.18f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.18f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.18f, 16.0f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _drawPolygon!!
    }

private var _drawPolygon: ImageVector? = null
