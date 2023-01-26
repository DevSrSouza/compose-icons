package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.WrongLocation: ImageVector
    get() {
        if (_wrongLocation != null) {
            return _wrongLocation!!
        }
        _wrongLocation = Builder(name = "WrongLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.0f)
                curveToRelative(0.0f, 0.07f, 0.0f, 0.13f, 0.0f, 0.2f)
                curveToRelative(0.0f, 2.34f, -1.95f, 5.44f, -6.0f, 9.14f)
                curveToRelative(-4.05f, -3.7f, -6.0f, -6.79f, -6.0f, -9.14f)
                curveTo(6.0f, 7.57f, 8.65f, 5.0f, 12.0f, 5.0f)
                curveToRelative(0.34f, 0.0f, 0.68f, 0.03f, 1.0f, 0.08f)
                verticalLineTo(3.06f)
                curveTo(12.67f, 3.02f, 12.34f, 3.0f, 12.0f, 3.0f)
                curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f)
                curveToRelative(0.0f, 3.32f, 2.67f, 7.25f, 8.0f, 11.8f)
                curveToRelative(5.33f, -4.55f, 8.0f, -8.48f, 8.0f, -11.8f)
                curveToRelative(0.0f, -0.07f, 0.0f, -0.13f, 0.0f, -0.2f)
                horizontalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.54f, 2.88f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(-2.12f, 2.13f)
                lineToRelative(-2.12f, -2.13f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(2.13f, 2.12f)
                lineToRelative(-2.13f, 2.12f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(2.12f, -2.13f)
                lineToRelative(2.12f, 2.13f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-2.13f, -2.12f)
                close()
            }
        }
        .build()
        return _wrongLocation!!
    }

private var _wrongLocation: ImageVector? = null
