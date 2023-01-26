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

public val SharpGroup.TransferWithinAStation: ImageVector
    get() {
        if (_transferWithinAStation != null) {
            return _transferWithinAStation!!
        }
        _transferWithinAStation = Builder(name = "TransferWithinAStation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.49f, 15.5f)
                verticalLineToRelative(-1.75f)
                lineTo(14.0f, 16.25f)
                lineToRelative(2.49f, 2.5f)
                lineTo(16.49f, 17.0f)
                lineTo(22.0f, 17.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5.51f)
                close()
                moveTo(19.51f, 19.75f)
                lineTo(14.0f, 19.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.51f)
                lineTo(19.51f, 23.0f)
                lineTo(22.0f, 20.5f)
                lineTo(19.51f, 18.0f)
                verticalLineToRelative(1.75f)
                close()
                moveTo(9.5f, 5.5f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(5.75f, 8.9f)
                lineTo(3.0f, 23.0f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.75f, -8.0f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.55f)
                lineTo(8.95f, 13.4f)
                lineToRelative(0.6f, -3.0f)
                curveTo(10.85f, 12.0f, 12.8f, 13.0f, 15.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.85f, 0.0f, -3.45f, -1.0f, -4.35f, -2.45f)
                lineToRelative(-0.95f, -1.6f)
                curveTo(9.35f, 6.35f, 8.7f, 6.0f, 8.0f, 6.0f)
                curveToRelative(-0.25f, 0.0f, -0.5f, 0.05f, -0.75f, 0.15f)
                lineTo(2.0f, 8.3f)
                lineTo(2.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 9.65f)
                lineToRelative(1.75f, -0.75f)
            }
        }
        .build()
        return _transferWithinAStation!!
    }

private var _transferWithinAStation: ImageVector? = null
