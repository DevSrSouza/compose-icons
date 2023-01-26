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

public val OutlineGroup.EditLocation: ImageVector
    get() {
        if (_editLocation != null) {
            return _editLocation!!
        }
        _editLocation = Builder(name = "EditLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.17f, 4.91f)
                lineTo(17.1f, 3.84f)
                lineToRelative(-5.55f, 5.55f)
                verticalLineToRelative(1.08f)
                horizontalLineToRelative(1.08f)
                lineToRelative(5.54f, -5.56f)
                close()
                moveTo(16.0f, 2.74f)
                lineToRelative(1.29f, -1.29f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, true, 2.12f, 0.0f)
                lineToRelative(1.15f, 1.15f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f)
                lineToRelative(-0.68f, 0.68f)
                lineToRelative(-0.02f, 0.02f)
                lineToRelative(-0.58f, 0.58f)
                lineToRelative(-6.0f, 6.0f)
                lineTo(10.0f, 12.0f)
                lineTo(10.0f, 8.74f)
                lineToRelative(6.0f, -6.0f)
                close()
                moveTo(13.72f, 2.19f)
                lineToRelative(-0.55f, 0.55f)
                lineToRelative(-1.27f, 1.27f)
                curveToRelative(-3.3f, 0.05f, -5.9f, 2.6f, -5.9f, 6.2f)
                curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f)
                curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f)
                verticalLineToRelative(-0.1f)
                lineToRelative(1.8f, -1.8f)
                curveToRelative(0.13f, 0.6f, 0.2f, 1.24f, 0.2f, 1.9f)
                curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f)
                curveToRelative(0.0f, -4.98f, 3.8f, -8.2f, 8.0f, -8.2f)
                curveToRelative(0.58f, 0.0f, 1.16f, 0.06f, 1.72f, 0.18f)
                close()
            }
        }
        .build()
        return _editLocation!!
    }

private var _editLocation: ImageVector? = null
