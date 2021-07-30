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

public val OutlineGroup.Email: ImageVector
    get() {
        if (_email != null) {
            return _email!!
        }
        _email = Builder(name = "Email", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(19.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 7.0f)
                lineTo(2.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(19.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(22.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 4.0f)
                close()
                moveTo(18.33f, 6.0f)
                lineTo(12.0f, 10.75f)
                lineTo(5.67f, 6.0f)
                close()
                moveTo(19.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(4.0f, 7.25f)
                lineToRelative(7.4f, 5.55f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.6f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.6f, -0.2f)
                lineTo(20.0f, 7.25f)
                lineTo(20.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 18.0f)
                close()
            }
        }
        .build()
        return _email!!
    }

private var _email: ImageVector? = null
