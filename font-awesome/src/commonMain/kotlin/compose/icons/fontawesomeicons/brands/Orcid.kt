package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Orcid: ImageVector
    get() {
        if (_orcid != null) {
            return _orcid!!
        }
        _orcid = Builder(name = "Orcid", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(294.75f, 188.19f)
                horizontalLineToRelative(-45.92f)
                lineTo(248.83f, 342.0f)
                horizontalLineToRelative(47.47f)
                curveToRelative(67.62f, 0.0f, 83.12f, -51.34f, 83.12f, -76.91f)
                curveToRelative(0.0f, -41.64f, -26.54f, -76.9f, -84.67f, -76.9f)
                close()
                moveTo(256.0f, 8.0f)
                curveTo(119.0f, 8.0f, 8.0f, 119.0f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(393.0f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(175.21f, 368.76f)
                horizontalLineToRelative(-29.84f)
                verticalLineToRelative(-207.5f)
                horizontalLineToRelative(29.84f)
                close()
                moveTo(160.29f, 137.62f)
                arcToRelative(19.57f, 19.57f, 0.0f, true, true, 19.57f, -19.57f)
                arcToRelative(19.64f, 19.64f, 0.0f, false, true, -19.57f, 19.57f)
                close()
                moveTo(300.0f, 369.0f)
                horizontalLineToRelative(-81.0f)
                lineTo(219.0f, 161.26f)
                horizontalLineToRelative(80.6f)
                curveToRelative(76.73f, 0.0f, 110.44f, 54.83f, 110.44f, 103.85f)
                curveTo(410.0f, 318.39f, 368.38f, 369.0f, 300.0f, 369.0f)
                close()
            }
        }
        .build()
        return _orcid!!
    }

private var _orcid: ImageVector? = null
