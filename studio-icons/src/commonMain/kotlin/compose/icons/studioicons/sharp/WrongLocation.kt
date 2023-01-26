package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.WrongLocation: ImageVector
    get() {
        if (_wrongLocation != null) {
            return _wrongLocation!!
        }
        _wrongLocation = Builder(name = "WrongLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                verticalLineTo(3.26f)
                curveTo(13.35f, 3.09f, 12.68f, 3.0f, 12.0f, 3.0f)
                curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f)
                curveToRelative(0.0f, 3.32f, 2.67f, 7.25f, 8.0f, 11.8f)
                curveToRelative(5.33f, -4.55f, 8.0f, -8.48f, 8.0f, -11.8f)
                curveToRelative(0.0f, -0.41f, -0.04f, -0.81f, -0.09f, -1.2f)
                horizontalLineTo(14.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveTo(14.0f, 12.1f, 13.1f, 13.0f, 12.0f, 13.0f)
                close()
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
