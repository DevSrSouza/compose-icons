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

public val OutlineGroup.Airlines: ImageVector
    get() {
        if (_airlines != null) {
            return _airlines!!
        }
        _airlines = Builder(name = "Airlines", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.34f, 18.0f)
                horizontalLineTo(5.8f)
                lineToRelative(8.25f, -12.0f)
                horizontalLineToRelative(5.54f)
                lineTo(17.34f, 18.0f)
                close()
                moveTo(13.0f, 4.0f)
                lineTo(2.0f, 20.0f)
                horizontalLineToRelative(17.0f)
                lineToRelative(3.0f, -16.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(14.5f, 9.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(15.88f, 9.0f, 14.5f, 9.0f)
                close()
            }
        }
        .build()
        return _airlines!!
    }

private var _airlines: ImageVector? = null
