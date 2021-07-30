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

public val FillGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(18.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.1f, 0.86f)
                lineTo(8.0f, 12.34f)
                curveToRelative(0.0f, -0.12f, 0.0f, -0.22f, 0.0f, -0.34f)
                reflectiveCurveToRelative(0.0f, -0.22f, 0.0f, -0.33f)
                lineTo(15.9f, 8.14f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 15.0f, 6.0f)
                curveToRelative(0.0f, 0.12f, 0.0f, 0.22f, 0.0f, 0.34f)
                lineTo(7.1f, 9.86f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 4.28f)
                lineTo(15.0f, 17.67f)
                curveToRelative(0.0f, 0.11f, 0.0f, 0.22f, 0.0f, 0.33f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
