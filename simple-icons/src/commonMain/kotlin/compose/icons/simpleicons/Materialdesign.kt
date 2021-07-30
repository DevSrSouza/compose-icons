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

public val SimpleIcons.Materialdesign: ImageVector
    get() {
        if (_materialdesign != null) {
            return _materialdesign!!
        }
        _materialdesign = Builder(name = "Materialdesign", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.377f, 0.0f, 0.0f, 5.377f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.377f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.377f, 12.0f, -12.0f)
                reflectiveCurveTo(18.623f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 0.75f)
                curveToRelative(2.871f, 0.0f, 5.482f, 1.082f, 7.469f, 2.85f)
                lineTo(4.53f, 3.6f)
                arcTo(11.197f, 11.197f, 0.0f, false, true, 12.0f, 0.75f)
                close()
                moveTo(4.814f, 4.35f)
                horizontalLineToRelative(14.372f)
                lineTo(12.0f, 18.723f)
                lineTo(4.814f, 4.35f)
                close()
                moveTo(3.6f, 4.53f)
                lineTo(3.6f, 19.47f)
                arcTo(11.197f, 11.197f, 0.0f, false, true, 0.75f, 12.0f)
                curveToRelative(0.0f, -2.87f, 1.082f, -5.481f, 2.85f, -7.468f)
                close()
                moveTo(20.4f, 4.53f)
                arcTo(11.197f, 11.197f, 0.0f, false, true, 23.25f, 12.0f)
                curveToRelative(0.0f, 2.871f, -1.082f, 5.482f, -2.85f, 7.469f)
                lineTo(20.4f, 4.53f)
                close()
                moveTo(4.35f, 5.1f)
                lineToRelative(7.275f, 14.55f)
                lineTo(4.35f, 19.65f)
                lineTo(4.35f, 5.1f)
                close()
                moveTo(19.65f, 5.1f)
                verticalLineToRelative(14.55f)
                horizontalLineToRelative(-7.275f)
                lineTo(19.651f, 5.1f)
                close()
                moveTo(4.533f, 20.4f)
                lineTo(19.469f, 20.4f)
                arcTo(11.197f, 11.197f, 0.0f, false, true, 12.0f, 23.25f)
                arcToRelative(11.197f, 11.197f, 0.0f, false, true, -7.468f, -2.85f)
                close()
            }
        }
        .build()
        return _materialdesign!!
    }

private var _materialdesign: ImageVector? = null
