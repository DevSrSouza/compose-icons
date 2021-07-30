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

public val SimpleIcons.Abstract: ImageVector
    get() {
        if (_abstract != null) {
            return _abstract!!
        }
        _abstract = Builder(name = "Abstract", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(9.601f, 0.0f, 12.0f, 2.399f, 12.0f, 12.0f)
                curveToRelative(0.0f, 9.601f, -2.399f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-9.601f, 0.0f, -12.0f, -2.399f, -12.0f, -12.0f)
                curveTo(0.0f, 2.399f, 2.399f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(10.031f, 18.564f)
                curveToRelative(2.524f, 0.003f, 4.604f, -2.07f, 4.609f, -4.595f)
                curveToRelative(0.0f, -2.521f, -2.074f, -4.595f, -4.595f, -4.595f)
                reflectiveCurveTo(5.45f, 11.449f, 5.45f, 13.969f)
                curveToRelative(0.0f, 2.516f, 2.065f, 4.588f, 4.581f, 4.595f)
                close()
                moveTo(18.375f, 18.375f)
                lineTo(18.375f, 5.625f)
                lineTo(5.625f, 5.625f)
                verticalLineToRelative(2.247f)
                horizontalLineToRelative(10.498f)
                verticalLineToRelative(10.503f)
                horizontalLineToRelative(2.252f)
                close()
                moveTo(10.031f, 11.627f)
                arcToRelative(2.343f, 2.343f, 0.0f, true, true, -0.002f, 4.686f)
                arcToRelative(2.343f, 2.343f, 0.0f, false, true, 0.002f, -4.686f)
                close()
            }
        }
        .build()
        return _abstract!!
    }

private var _abstract: ImageVector? = null
