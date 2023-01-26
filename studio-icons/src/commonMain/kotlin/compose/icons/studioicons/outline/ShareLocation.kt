package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ShareLocation: ImageVector
    get() {
        if (_shareLocation != null) {
            return _shareLocation!!
        }
        _shareLocation = Builder(name = "ShareLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.02f, 19.93f)
                verticalLineToRelative(2.02f)
                curveToRelative(2.01f, -0.2f, 3.84f, -1.0f, 5.32f, -2.21f)
                lineToRelative(-1.42f, -1.43f)
                curveTo(15.81f, 19.17f, 14.48f, 19.75f, 13.02f, 19.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.03f, 12.0f)
                curveToRelative(0.0f, -4.05f, 3.03f, -7.41f, 6.95f, -7.93f)
                verticalLineTo(2.05f)
                curveTo(5.95f, 2.58f, 2.03f, 6.84f, 2.03f, 12.0f)
                curveToRelative(0.0f, 5.16f, 3.92f, 9.42f, 8.95f, 9.95f)
                verticalLineToRelative(-2.02f)
                curveTo(7.06f, 19.41f, 4.03f, 16.05f, 4.03f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.95f, 11.0f)
                horizontalLineToRelative(2.02f)
                curveToRelative(-0.2f, -2.01f, -1.0f, -3.84f, -2.21f, -5.32f)
                lineToRelative(-1.43f, 1.43f)
                curveTo(19.19f, 8.21f, 19.77f, 9.54f, 19.95f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.34f, 4.26f)
                curveToRelative(-1.48f, -1.21f, -3.32f, -2.01f, -5.32f, -2.21f)
                verticalLineToRelative(2.02f)
                curveToRelative(1.46f, 0.18f, 2.79f, 0.76f, 3.9f, 1.62f)
                lineTo(18.34f, 4.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.33f, 16.9f)
                lineToRelative(1.43f, 1.42f)
                curveToRelative(1.21f, -1.48f, 2.01f, -3.31f, 2.21f, -5.32f)
                horizontalLineToRelative(-2.02f)
                curveTo(19.77f, 14.46f, 19.19f, 15.79f, 18.33f, 16.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 11.1f)
                curveTo(16.0f, 8.61f, 14.1f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(-4.0f, 1.61f, -4.0f, 4.1f)
                curveToRelative(0.0f, 1.66f, 1.33f, 3.63f, 4.0f, 5.9f)
                curveTo(14.67f, 14.73f, 16.0f, 12.76f, 16.0f, 11.1f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-0.59f, 0.0f, -1.07f, -0.48f, -1.07f, -1.07f)
                curveToRelative(0.0f, -0.59f, 0.48f, -1.07f, 1.07f, -1.07f)
                reflectiveCurveToRelative(1.07f, 0.48f, 1.07f, 1.07f)
                curveTo(13.07f, 11.52f, 12.59f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _shareLocation!!
    }

private var _shareLocation: ImageVector? = null
