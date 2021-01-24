package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HandHoldingMedical: ImageVector
    get() {
        if (_handHoldingMedical != null) {
            return _handHoldingMedical!!
        }
        _handHoldingMedical = Builder(name = "HandHoldingMedical", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.88f, 175.82f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(-64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 159.88f, 175.82f)
                close()
                moveTo(568.07f, 336.13f)
                arcToRelative(39.91f, 39.91f, 0.0f, false, false, -55.93f, -8.47f)
                lineTo(392.47f, 415.84f)
                horizontalLineTo(271.86f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                horizontalLineTo(350.1f)
                curveToRelative(16.0f, 0.0f, 30.75f, -10.87f, 33.37f, -26.61f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, -31.62f, -37.38f)
                horizontalLineToRelative(-160.0f)
                arcToRelative(117.7f, 117.7f, 0.0f, false, false, -74.12f, 26.25f)
                lineToRelative(-46.5f, 37.74f)
                horizontalLineTo(15.87f)
                arcToRelative(16.11f, 16.11f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.11f, 16.11f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(347.0f)
                arcToRelative(104.8f, 104.8f, 0.0f, false, false, 61.7f, -20.27f)
                lineTo(559.6f, 392.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 568.07f, 336.13f)
                close()
            }
        }
        .build()
        return _handHoldingMedical!!
    }

private var _handHoldingMedical: ImageVector? = null
