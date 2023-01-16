package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.VectorCurve: ImageVector
    get() {
        if (_vectorCurve != null) {
            return _vectorCurve!!
        }
        _vectorCurve = Builder(name = "VectorCurve", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 5.0f)
                curveTo(18.27f, 5.0f, 18.05f, 4.95f, 17.85f, 4.85f)
                lineTo(14.16f, 8.55f)
                lineTo(14.5f, 9.0f)
                curveTo(16.69f, 7.74f, 19.26f, 7.0f, 22.0f, 7.0f)
                lineTo(23.0f, 7.03f)
                verticalLineTo(9.04f)
                lineTo(22.0f, 9.0f)
                curveTo(19.42f, 9.0f, 17.0f, 9.75f, 15.0f, 11.04f)
                arcTo(3.96f, 3.96f, 0.0f, false, true, 11.04f, 15.0f)
                curveTo(9.75f, 17.0f, 9.0f, 19.42f, 9.0f, 22.0f)
                lineTo(9.04f, 23.0f)
                horizontalLineTo(7.03f)
                lineTo(7.0f, 22.0f)
                curveTo(7.0f, 19.26f, 7.74f, 16.69f, 9.0f, 14.5f)
                lineTo(8.55f, 14.16f)
                lineTo(4.85f, 17.85f)
                curveTo(4.95f, 18.05f, 5.0f, 18.27f, 5.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 17.0f)
                curveTo(3.73f, 17.0f, 3.95f, 17.05f, 4.15f, 17.15f)
                lineTo(7.84f, 13.45f)
                curveTo(7.31f, 12.78f, 7.0f, 11.92f, 7.0f, 11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 7.0f)
                curveTo(11.92f, 7.0f, 12.78f, 7.31f, 13.45f, 7.84f)
                lineTo(17.15f, 4.15f)
                curveTo(17.05f, 3.95f, 17.0f, 3.73f, 17.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 2.0f)
                moveTo(11.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 9.0f)
                close()
            }
        }
        .build()
        return _vectorCurve!!
    }

private var _vectorCurve: ImageVector? = null
