package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.Pricetags: ImageVector
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
                moveTo(21.47f, 11.58f)
                lineTo(15.05f, 5.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.61f, -0.29f)
                lineTo(5.09f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, 0.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.29f, 0.8f)
                lineToRelative(0.88f, 9.35f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.29f, 0.61f)
                lineToRelative(6.41f, 6.42f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, false, 1.29f, 0.53f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, false, 1.28f, -0.53f)
                lineToRelative(7.32f, -7.32f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, false, 0.0f, -2.57f)
                close()
                moveTo(11.56f, 11.58f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -2.12f)
                arcTo(1.49f, 1.49f, 0.0f, false, true, 11.56f, 11.56f)
                close()
            }
        }
        .build()
        return _pricetags!!
    }

private var _pricetags: ImageVector? = null
