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

public val FillGroup.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 14.0f)
                arcTo(5.51f, 5.51f, 0.0f, false, true, 13.0f, 17.93f)
                arcTo(6.15f, 6.15f, 0.0f, false, true, 6.0f, 12.48f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcToRelative(6.12f, 6.12f, 0.0f, false, true, 2.27f, 0.44f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.64f, -0.21f)
                lineToRelative(1.44f, -2.65f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, -0.23f, -0.7f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.29f)
                arcTo(10.12f, 10.12f, 0.0f, false, false, 11.57f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.52f)
                curveToRelative(0.0f, -0.2f, 0.0f, -1.35f, 0.0f, -2.0f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(5.0f)
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
