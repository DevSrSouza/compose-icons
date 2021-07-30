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

public val FillGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(0.0f, -24.0f)
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.27f, 4.68f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, false, -1.6f, -0.25f)
                arcToRelative(7.53f, 7.53f, 0.0f, false, true, -2.17f, 0.28f)
                arcToRelative(8.54f, 8.54f, 0.0f, false, true, -3.13f, -0.78f)
                arcTo(10.15f, 10.15f, 0.0f, false, false, 8.5f, 3.0f)
                curveToRelative(-2.89f, 0.0f, -4.0f, 1.0f, -4.2f, 1.14f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.3f, 0.72f)
                verticalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(15.7f)
                arcToRelative(6.28f, 6.28f, 0.0f, false, true, 2.5f, -0.41f)
                arcToRelative(8.54f, 8.54f, 0.0f, false, true, 3.13f, 0.78f)
                arcTo(10.15f, 10.15f, 0.0f, false, false, 15.5f, 17.0f)
                arcTo(7.66f, 7.66f, 0.0f, false, false, 19.0f, 16.3f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, 1.0f, -1.55f)
                verticalLineTo(6.11f)
                arcTo(1.77f, 1.77f, 0.0f, false, false, 19.27f, 4.68f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
