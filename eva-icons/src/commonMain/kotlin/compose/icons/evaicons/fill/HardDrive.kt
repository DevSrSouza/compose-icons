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

public val FillGroup.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) {
            return _hardDrive!!
        }
        _hardDrive = Builder(name = "HardDrive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.79f, 11.34f)
                lineTo(17.45f, 4.66f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.76f, 3.0f)
                lineTo(9.24f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.55f, 4.66f)
                lineTo(3.21f, 11.34f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.21f, 0.9f)
                lineTo(3.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(18.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(21.0f, 12.24f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.79f, 11.34f)
                close()
                moveTo(8.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 17.0f)
                close()
                moveTo(16.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(5.62f, 11.0f)
                lineTo(8.34f, 5.55f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.24f, 5.0f)
                horizontalLineToRelative(5.52f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.9f, 0.55f)
                lineTo(18.38f, 11.0f)
                close()
            }
        }
        .build()
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
