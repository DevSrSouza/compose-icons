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

public val FillGroup.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.3f, 13.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.25f, 0.65f)
                arcTo(7.14f, 7.14f, 0.0f, false, true, 12.18f, 19.0f)
                arcTo(7.1f, 7.1f, 0.0f, false, true, 5.0f, 12.0f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, true, 7.18f, -7.0f)
                arcToRelative(7.26f, 7.26f, 0.0f, false, true, 4.65f, 1.67f)
                lineToRelative(-2.17f, -0.36f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.15f, 0.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.83f, 1.15f)
                lineToRelative(4.24f, 0.7f)
                horizontalLineToRelative(0.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.34f, -0.06f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, 0.1f, -0.06f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, false, 0.2f, -0.11f)
                lineToRelative(0.09f, -0.11f)
                curveToRelative(0.0f, -0.05f, 0.09f, -0.09f, 0.13f, -0.15f)
                reflectiveCurveToRelative(0.0f, -0.1f, 0.05f, -0.14f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, false, 0.07f, -0.18f)
                lineToRelative(0.75f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, -0.38f)
                lineToRelative(-0.27f, 1.45f)
                arcTo(9.21f, 9.21f, 0.0f, false, false, 12.18f, 3.0f)
                arcTo(9.1f, 9.1f, 0.0f, false, false, 3.0f, 12.0f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, false, 9.18f, 9.0f)
                arcTo(9.12f, 9.12f, 0.0f, false, false, 21.0f, 14.68f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.3f, 13.43f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
