package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SettingsInputComposite: ImageVector
    get() {
        if (_settingsInputComposite != null) {
            return _settingsInputComposite!!
        }
        _settingsInputComposite = Builder(name = "SettingsInputComposite", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(1.0f, 6.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f)
                lineTo(3.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.18f)
                curveTo(6.16f, 18.4f, 7.0f, 17.3f, 7.0f, 16.0f)
                lineTo(7.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                lineTo(5.0f, 2.0f)
                close()
                moveTo(4.0f, 17.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(3.0f, 12.0f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 12.0f)
                close()
                moveTo(13.0f, 2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(9.0f, 6.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f)
                lineTo(11.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.18f)
                curveToRelative(1.16f, -0.42f, 2.0f, -1.52f, 2.0f, -2.82f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 2.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(11.0f, 12.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 6.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f)
                lineTo(19.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.18f)
                curveToRelative(1.16f, -0.42f, 2.0f, -1.52f, 2.0f, -2.82f)
                lineTo(23.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 17.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(19.0f, 12.0f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _settingsInputComposite!!
    }

private var _settingsInputComposite: ImageVector? = null
