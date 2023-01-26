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

public val OutlineGroup.ImageSearch: ImageVector
    get() {
        if (_imageSearch != null) {
            return _imageSearch!!
        }
        _imageSearch = Builder(name = "ImageSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                verticalLineToRelative(7.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(5.02f)
                curveToRelative(0.05f, -0.71f, 0.22f, -1.38f, 0.48f, -2.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(-2.0f, -2.0f)
                close()
                moveTo(16.5f, 18.0f)
                horizontalLineToRelative(-11.0f)
                lineToRelative(2.75f, -3.53f)
                lineToRelative(1.96f, 2.36f)
                lineToRelative(2.75f, -3.54f)
                lineTo(16.5f, 18.0f)
                close()
                moveTo(19.3f, 8.89f)
                curveToRelative(0.44f, -0.7f, 0.7f, -1.51f, 0.7f, -2.39f)
                curveTo(20.0f, 4.01f, 17.99f, 2.0f, 15.5f, 2.0f)
                reflectiveCurveTo(11.0f, 4.01f, 11.0f, 6.5f)
                reflectiveCurveToRelative(2.01f, 4.5f, 4.49f, 4.5f)
                curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f)
                lineTo(21.0f, 13.42f)
                lineTo(22.42f, 12.0f)
                lineTo(19.3f, 8.89f)
                close()
                moveTo(15.5f, 9.0f)
                curveTo(14.12f, 9.0f, 13.0f, 7.88f, 13.0f, 6.5f)
                reflectiveCurveTo(14.12f, 4.0f, 15.5f, 4.0f)
                reflectiveCurveTo(18.0f, 5.12f, 18.0f, 6.5f)
                reflectiveCurveTo(16.88f, 9.0f, 15.5f, 9.0f)
                close()
            }
        }
        .build()
        return _imageSearch!!
    }

private var _imageSearch: ImageVector? = null
