package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.EditLocation: ImageVector
    get() {
        if (_editLocation != null) {
            return _editLocation!!
        }
        _editLocation = Builder(name = "EditLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.11f, 14.0f)
                horizontalLineToRelative(-0.83f)
                horizontalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.0f)
                verticalLineTo(8.74f)
                verticalLineTo(7.91f)
                lineToRelative(0.59f, -0.59f)
                lineTo(11.91f, 4.0f)
                curveTo(8.61f, 4.05f, 6.0f, 6.6f, 6.0f, 10.2f)
                curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f)
                curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f)
                curveToRelative(0.0f, -0.03f, 0.0f, -0.06f, 0.0f, -0.08f)
                lineToRelative(-3.3f, 3.3f)
                lineTo(14.11f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.17f, 4.91f)
                lineTo(17.1f, 3.84f)
                lineToRelative(-5.55f, 5.55f)
                verticalLineToRelative(1.08f)
                horizontalLineToRelative(1.08f)
                lineTo(18.17f, 4.91f)
                close()
                moveTo(16.0f, 2.74f)
                lineToRelative(1.29f, -1.29f)
                curveToRelative(0.58f, -0.59f, 1.52f, -0.59f, 2.11f, -0.01f)
                curveToRelative(0.0f, 0.0f, 0.01f, 0.01f, 0.01f, 0.01f)
                lineToRelative(1.15f, 1.15f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f)
                lineTo(19.88f, 5.4f)
                lineToRelative(-0.02f, 0.02f)
                lineTo(19.28f, 6.0f)
                lineToRelative(-6.0f, 6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.74f)
                lineTo(16.0f, 2.74f)
                close()
                moveTo(13.72f, 2.19f)
                lineToRelative(-0.55f, 0.55f)
                lineTo(11.9f, 4.01f)
                curveTo(8.6f, 4.06f, 6.0f, 6.61f, 6.0f, 10.21f)
                curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f)
                curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f)
                verticalLineToRelative(-0.1f)
                lineToRelative(1.8f, -1.8f)
                curveToRelative(0.13f, 0.6f, 0.2f, 1.24f, 0.2f, 1.9f)
                curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f)
                curveToRelative(0.0f, -4.98f, 3.8f, -8.2f, 8.0f, -8.2f)
                curveTo(12.58f, 2.01f, 13.16f, 2.07f, 13.72f, 2.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.17f, 4.91f)
                lineToRelative(-1.07f, -1.07f)
                lineToRelative(-5.55f, 5.55f)
                lineToRelative(0.0f, 1.08f)
                lineToRelative(1.08f, 0.0f)
                close()
            }
        }
        .build()
        return _editLocation!!
    }

private var _editLocation: ImageVector? = null
