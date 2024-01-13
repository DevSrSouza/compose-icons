package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ChildDress: ImageVector
    get() {
        if (_childDress != null) {
            return _childDress!!
        }
        _childDress = Builder(name = "ChildDress", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 96.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 128.0f, 0.0f)
                close()
                moveTo(88.0f, 400.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(400.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(400.0f)
                horizontalLineToRelative(17.8f)
                curveToRelative(10.9f, 0.0f, 18.6f, -10.7f, 15.2f, -21.1f)
                lineToRelative(-31.1f, -93.4f)
                lineToRelative(28.6f, 37.8f)
                curveToRelative(10.7f, 14.1f, 30.8f, 16.8f, 44.8f, 6.2f)
                reflectiveCurveToRelative(16.8f, -30.7f, 6.2f, -44.8f)
                lineTo(254.6f, 207.0f)
                curveToRelative(-22.4f, -29.6f, -57.5f, -47.0f, -94.6f, -47.0f)
                reflectiveCurveToRelative(-72.2f, 17.4f, -94.6f, 47.0f)
                lineTo(6.5f, 284.7f)
                curveToRelative(-10.7f, 14.1f, -7.9f, 34.2f, 6.2f, 44.8f)
                reflectiveCurveToRelative(34.2f, 7.9f, 44.8f, -6.2f)
                lineToRelative(28.7f, -37.8f)
                lineTo(55.0f, 378.9f)
                curveTo(51.6f, 389.3f, 59.3f, 400.0f, 70.2f, 400.0f)
                horizontalLineTo(88.0f)
                close()
            }
        }
        .build()
        return _childDress!!
    }

private var _childDress: ImageVector? = null
