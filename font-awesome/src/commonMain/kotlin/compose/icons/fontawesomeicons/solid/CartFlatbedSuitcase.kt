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

public val SolidGroup.CartFlatbedSuitcase: ImageVector
    get() {
        if (_cartFlatbedSuitcase != null) {
            return _cartFlatbedSuitcase!!
        }
        _cartFlatbedSuitcase = Builder(name = "CartFlatbedSuitcase", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                curveTo(0.0f, 14.3f, 14.3f, 0.0f, 32.0f, 0.0f)
                horizontalLineTo(48.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                verticalLineTo(368.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(608.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(541.3f)
                curveToRelative(1.8f, 5.0f, 2.7f, 10.4f, 2.7f, 16.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                reflectiveCurveToRelative(-48.0f, -21.5f, -48.0f, -48.0f)
                curveToRelative(0.0f, -5.6f, 1.0f, -11.0f, 2.7f, -16.0f)
                horizontalLineTo(253.3f)
                curveToRelative(1.8f, 5.0f, 2.7f, 10.4f, 2.7f, 16.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                reflectiveCurveToRelative(-48.0f, -21.5f, -48.0f, -48.0f)
                curveToRelative(0.0f, -5.6f, 1.0f, -11.0f, 2.7f, -16.0f)
                horizontalLineTo(144.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -35.8f, -80.0f, -80.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(32.0f)
                curveTo(14.3f, 64.0f, 0.0f, 49.7f, 0.0f, 32.0f)
                close()
                moveTo(432.0f, 96.0f)
                verticalLineTo(56.0f)
                curveToRelative(0.0f, -4.4f, -3.6f, -8.0f, -8.0f, -8.0f)
                horizontalLineTo(344.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(288.0f, 96.0f)
                verticalLineTo(56.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                verticalLineTo(96.0f)
                verticalLineTo(320.0f)
                horizontalLineTo(288.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(512.0f, 320.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineTo(272.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(512.0f)
                close()
                moveTo(240.0f, 96.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(320.0f)
                horizontalLineTo(240.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                verticalLineTo(144.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _cartFlatbedSuitcase!!
    }

private var _cartFlatbedSuitcase: ImageVector? = null
