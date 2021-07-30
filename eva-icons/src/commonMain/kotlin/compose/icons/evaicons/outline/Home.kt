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

public val OutlineGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.42f, 10.18f)
                lineTo(12.71f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                lineTo(3.58f, 10.19f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 11.62f)
                lineTo(3.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.89f, 2.0f)
                lineTo(19.11f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 20.0f)
                lineTo(21.0f, 11.62f)
                arcTo(2.07f, 2.07f, 0.0f, false, false, 20.42f, 10.18f)
                close()
                moveTo(10.0f, 20.0f)
                lineTo(10.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(19.0f, 20.0f)
                lineTo(16.0f, 20.0f)
                lineTo(16.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(9.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                lineTo(5.0f, 20.0f)
                lineTo(5.0f, 11.58f)
                lineToRelative(7.0f, -7.15f)
                lineToRelative(7.0f, 7.19f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
