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

public val OutlineGroup.DoNotTouch: ImageVector
    get() {
        if (_doNotTouch != null) {
            return _doNotTouch!!
        }
        _doNotTouch = Builder(name = "DoNotTouch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(7.0f, 9.83f)
                lineToRelative(0.0f, 4.3f)
                lineToRelative(-2.6f, -1.48f)
                curveToRelative(-0.17f, -0.09f, -0.34f, -0.14f, -0.54f, -0.14f)
                curveToRelative(-0.26f, 0.0f, -0.5f, 0.09f, -0.7f, 0.26f)
                lineTo(2.0f, 13.88f)
                lineToRelative(6.8f, 7.18f)
                curveToRelative(0.57f, 0.6f, 1.35f, 0.94f, 2.18f, 0.94f)
                horizontalLineTo(17.0f)
                curveToRelative(0.62f, 0.0f, 1.18f, -0.19f, 1.66f, -0.52f)
                lineToRelative(1.12f, 1.12f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(17.0f, 20.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.39f, 0.0f, -0.64f, -0.23f, -0.75f, -0.36f)
                lineTo(6.87f, 16.0f)
                horizontalLineTo(9.0f)
                lineToRelative(0.0f, -4.17f)
                lineToRelative(8.14f, 8.14f)
                curveTo(17.09f, 19.98f, 17.05f, 20.0f, 17.0f, 20.0f)
                close()
                moveTo(13.83f, 11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.25f)
                curveTo(14.0f, 2.56f, 14.56f, 2.0f, 15.25f, 2.0f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(5.25f)
                curveTo(17.5f, 4.56f, 18.06f, 4.0f, 18.75f, 4.0f)
                reflectiveCurveTo(20.0f, 4.56f, 20.0f, 5.25f)
                verticalLineToRelative(11.92f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-2.17f)
                lineTo(13.83f, 11.0f)
                close()
                moveTo(13.0f, 10.17f)
                verticalLineTo(2.25f)
                curveTo(13.0f, 1.56f, 12.44f, 1.0f, 11.75f, 1.0f)
                reflectiveCurveTo(10.5f, 1.56f, 10.5f, 2.25f)
                verticalLineToRelative(5.42f)
                lineTo(13.0f, 10.17f)
                close()
                moveTo(9.5f, 6.67f)
                verticalLineTo(4.25f)
                curveTo(9.5f, 3.56f, 8.94f, 3.0f, 8.25f, 3.0f)
                curveToRelative(-0.67f, 0.0f, -1.2f, 0.53f, -1.24f, 1.18f)
                verticalLineToRelative(0.0f)
                lineTo(9.5f, 6.67f)
                close()
            }
        }
        .build()
        return _doNotTouch!!
    }

private var _doNotTouch: ImageVector? = null
