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

public val TwotoneGroup.AccountCircle: ImageVector
    get() {
        if (_accountCircle != null) {
            return _accountCircle!!
        }
        _accountCircle = Builder(name = "AccountCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                curveToRelative(0.0f, 1.95f, 0.7f, 3.73f, 1.86f, 5.12f)
                curveTo(7.55f, 15.8f, 9.68f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveToRelative(4.45f, 0.8f, 6.14f, 2.12f)
                curveTo(19.3f, 15.73f, 20.0f, 13.95f, 20.0f, 12.0f)
                curveTo(20.0f, 7.58f, 16.42f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveTo(8.5f, 7.57f, 10.07f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveTo(15.5f, 11.43f, 13.93f, 13.0f, 12.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-1.74f, 0.0f, -3.34f, -0.56f, -4.65f, -1.5f)
                curveTo(8.66f, 17.56f, 10.26f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveToRelative(3.34f, 0.56f, 4.65f, 1.5f)
                curveTo(15.34f, 19.44f, 13.74f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(18.14f, 17.12f)
                curveTo(16.45f, 15.8f, 14.32f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveToRelative(-4.45f, 0.8f, -6.14f, 2.12f)
                curveTo(4.7f, 15.73f, 4.0f, 13.95f, 4.0f, 12.0f)
                curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f)
                curveTo(20.0f, 13.95f, 19.3f, 15.73f, 18.14f, 17.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.93f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveTo(15.5f, 7.5f, 13.93f, 5.93f, 12.0f, 5.93f)
                close()
                moveTo(12.0f, 10.93f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(12.83f, 10.93f, 12.0f, 10.93f)
                close()
            }
        }
        .build()
        return _accountCircle!!
    }

private var _accountCircle: ImageVector? = null
