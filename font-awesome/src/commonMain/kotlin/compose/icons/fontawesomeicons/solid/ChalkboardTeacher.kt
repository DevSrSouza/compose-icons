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

public val SolidGroup.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) {
            return _chalkboardTeacher!!
        }
        _chalkboardTeacher = Builder(name = "ChalkboardTeacher", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 352.0f)
                curveToRelative(-2.39f, 0.0f, -4.78f, 0.35f, -7.06f, 1.09f)
                curveTo(187.98f, 357.3f, 174.35f, 360.0f, 160.0f, 360.0f)
                curveToRelative(-14.35f, 0.0f, -27.98f, -2.7f, -40.95f, -6.91f)
                curveToRelative(-2.28f, -0.74f, -4.66f, -1.09f, -7.05f, -1.09f)
                curveTo(49.94f, 352.0f, -0.33f, 402.48f, 0.0f, 464.62f)
                curveTo(0.14f, 490.88f, 21.73f, 512.0f, 48.0f, 512.0f)
                horizontalLineToRelative(224.0f)
                curveToRelative(26.27f, 0.0f, 47.86f, -21.12f, 48.0f, -47.38f)
                curveToRelative(0.33f, -62.14f, -49.94f, -112.62f, -112.0f, -112.62f)
                close()
                moveTo(160.0f, 320.0f)
                curveToRelative(53.02f, 0.0f, 96.0f, -42.98f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-42.98f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 42.98f, -96.0f, 96.0f)
                reflectiveCurveToRelative(42.98f, 96.0f, 96.0f, 96.0f)
                close()
                moveTo(592.0f, 0.0f)
                lineTo(208.0f, 0.0f)
                curveToRelative(-26.47f, 0.0f, -48.0f, 22.25f, -48.0f, 49.59f)
                lineTo(160.0f, 96.0f)
                curveToRelative(23.42f, 0.0f, 45.1f, 6.78f, 64.0f, 17.8f)
                lineTo(224.0f, 64.0f)
                horizontalLineToRelative(352.0f)
                verticalLineToRelative(288.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(-64.0f)
                lineTo(384.0f, 288.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(-76.24f)
                curveToRelative(19.1f, 16.69f, 33.12f, 38.73f, 39.69f, 64.0f)
                lineTo(592.0f, 416.0f)
                curveToRelative(26.47f, 0.0f, 48.0f, -22.25f, 48.0f, -49.59f)
                lineTo(640.0f, 49.59f)
                curveTo(640.0f, 22.25f, 618.47f, 0.0f, 592.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
