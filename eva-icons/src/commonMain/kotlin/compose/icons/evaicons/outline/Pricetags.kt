package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Pricetags: ImageVector
    get() {
        if (_pricetags != null) {
            return _pricetags!!
        }
        _pricetags = Builder(name = "Pricetags", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.87f, 22.0f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, true, -1.29f, -0.53f)
                lineTo(5.17f, 15.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.29f, -0.61f)
                lineTo(4.0f, 5.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.29f, -0.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.09f, 4.0f)
                lineToRelative(9.35f, 0.88f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.61f, 0.29f)
                lineToRelative(6.42f, 6.41f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, 0.0f, 2.57f)
                lineToRelative(-7.32f, 7.32f)
                arcTo(1.82f, 1.82f, 0.0f, false, true, 12.87f, 22.0f)
                close()
                moveTo(6.87f, 13.89f)
                lineTo(12.87f, 19.89f)
                lineTo(19.92f, 12.84f)
                lineTo(13.92f, 6.84f)
                lineTo(6.11f, 6.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 10.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _pricetags!!
    }

private var _pricetags: ImageVector? = null
